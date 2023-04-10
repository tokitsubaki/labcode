import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class JsonJava {
    public static void main(String[] args) {

        // Jackson使用
        procJackson();

        System.out.println("------------------------------------------------");

        // Gson使用
        procGson();

    }

    public static void procJackson() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();

            // ファイルから読み込み
            JsonNode json = objectMapper.readTree(Paths.get("./data.json").toFile());
            System.out.println(json);
    
            // データの参照
            System.out.println(json.get("string"));
            System.out.println(json.get("int"));
            System.out.println(json.get("bool"));
            System.out.println(json.get("null"));

            System.out.println(json.get("array").get(0).get("no"));
            System.out.println(json.get("array").get(0).get("name"));
            System.out.println(json.get("array").get(1).get("no"));
            System.out.println(json.get("array").get(1).get("name"));

            for (JsonNode node : json.get("array")) {
                System.out.println(node.get("no"));
                System.out.println(node.get("name"));
            }

            System.out.println(json.get("object").get("no"));
            System.out.println(json.get("object").get("name"));

            // データの追加
            ((ObjectNode) json).put("string2", "文字列2");
            ((ObjectNode) json).put("int2", 2021);
            ((ObjectNode) json).put("bool2", false);
            ((ObjectNode) json).putNull("null2");
            ObjectNode ob1 = objectMapper.createObjectNode();
            ob1.put("no", 4);
            ob1.put("name", "Ruby");
            ((ArrayNode) json.path("array")).add(ob1);
            ObjectNode ob2 = objectMapper.createObjectNode();
            ob2.put("no", 5);
            ob2.put("name", "Go");
            ((ObjectNode) json.get("object")).set("object2", ob2);
            System.out.println(json.toPrettyString());

            // データの削除
            ((ObjectNode) json).remove("string2");
            ((ObjectNode) json).remove("int2");
            ((ObjectNode) json).remove("bool2");
            ((ObjectNode) json).remove("null2");
            ((ArrayNode) json.path("array")).remove(2);
            ((ObjectNode) json.get("object")).remove("object2");
            System.out.println(json.toPrettyString());

            // 文字列からJSONへの変換
            String s = "{\"text\": \"テキスト\", \"num\": 1}";
            JsonNode jsonNode = objectMapper.readTree(s);

            // JSONから文字列への変換
            System.out.println(jsonNode.toString());
            System.out.println(jsonNode.toPrettyString());

        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public static void procGson() {
        try {
            Gson gson = new Gson();

            // ファイルから読み込み
            JsonObject json = gson.fromJson(Files.readString(Paths.get("./data.json")), JsonObject.class);
            System.out.println(json);

            // データの参照
            System.out.println(json.get("string"));
            System.out.println(json.get("int"));
            System.out.println(json.get("bool"));
            System.out.println(json.get("null"));

            System.out.println(json.get("array").getAsJsonArray().get(0).getAsJsonObject().get("no"));
            System.out.println(json.get("array").getAsJsonArray().get(0).getAsJsonObject().get("name"));
            System.out.println(json.get("array").getAsJsonArray().get(1).getAsJsonObject().get("no"));
            System.out.println(json.get("array").getAsJsonArray().get(1).getAsJsonObject().get("name"));

            for (JsonElement element : json.get("array").getAsJsonArray()) {
                System.out.println(element.getAsJsonObject().get("no"));
                System.out.println(element.getAsJsonObject().get("name"));
            }

            System.out.println(json.get("object").getAsJsonObject().get("no"));
            System.out.println(json.get("object").getAsJsonObject().get("name"));

            // データの追加
            json.addProperty("string2", "文字列2");
            json.addProperty("int2", 2021);
            json.addProperty("bool2", false);
            json.add("null2", null);
            JsonObject jo1 = new JsonObject();
            jo1.addProperty("no", 4);
            jo1.addProperty("name", "Ruby");
            json.get("array").getAsJsonArray().add(jo1);
            JsonObject jo2 = new JsonObject();
            jo2.addProperty("no", 5);
            jo2.addProperty("name", "Go");
            json.get("object").getAsJsonObject().add("object2", jo2);
            System.out.println(new GsonBuilder().setPrettyPrinting().serializeNulls().create().toJson(json));

            // データの削除
            json.remove("string2");
            json.remove("int2");
            json.remove("bool2");
            json.remove("null2");
            json.get("array").getAsJsonArray().remove(2);
            json.get("object").getAsJsonObject().remove("object2");
            System.out.println(new GsonBuilder().setPrettyPrinting().serializeNulls().create().toJson(json));

            // 文字列からJSONオブジェクトへの変換
            String s = "{\"text\": \"テキスト\", \"num\": 1}";
            JsonObject jsonObject = gson.fromJson(s, JsonObject.class);

            // JSONオブジェクトから文字列への変換
            System.out.println(jsonObject.toString());
            System.out.println(new GsonBuilder().setPrettyPrinting().serializeNulls().create().toJson(jsonObject));

        } catch (Exception e) {
            System.out.println(e);
        }
    }



}