// 現在日時で生成
d = new Date();
console.log(d.toLocaleString());

// 任意の日時で生成
d = new Date(2020, 9, 19, 9, 0, 0, 0);
console.log(d.toLocaleString());

d = new Date('2020/10/19 09:00:00');
console.log(d.toLocaleString());

// 日時の加算
d = new Date(2020, 0, 1);
d.setFullYear(d.getFullYear() + 1);
d.setMonth(d.getMonth() + 1);
d.setDate(d.getDate() + 1);
d.setHours(d.getHours() + 1);
d.setMinutes(d.getMinutes() + 1);
d.setSeconds(d.getSeconds() + 1);
console.log(d.toLocaleString());

// 日時の減算
d = new Date(2020, 0, 1);
d.setFullYear(d.getFullYear() - 1);
d.setMonth(d.getMonth() - 1);
d.setDate(d.getDate() - 1);
d.setHours(d.getHours() - 1);
d.setMinutes(d.getMinutes() - 1);
d.setSeconds(d.getSeconds() - 1);
console.log(d.toLocaleString());

// 差分を取得
d1 = new Date(2020, 0, 1); // 2020/1/1 00:00:00
d2 = new Date(2020, 9, 19, 0, 0, 0); // 2020/10/19 00:00:00
diff = d2.getTime() - d1.getTime();
console.log(diff);
console.log(diff / (1000*60*60*24));

// 日時を比較
d1 = new Date(2020, 0, 1); // 2020/1/1 00:00:00
d2 = new Date(2020, 0, 1, 0, 0, 1); // 2020/1/1 00:00:01
if (d1.getTime() < d2.getTime()) {
    console.log("d2の方が新しい");
} else if (d1. getTime() > d2.getTime()) {
    console.log("d1の方が新しい");
} else {
    console.log("d1とd2は同じ")
}

// 日時から文字列への変換
d = new Date(2020, 9, 19, 10, 2, 3);
console.log(d.toDateString()); // -> Mon Oct 19 2020
console.log(d.toGMTString()); // -> Mon, 19 Oct 2020 01:02:03 GMT
console.log(d.toISOString()); // -> 2020-10-19T01:02:03.000Z
console.log(d.toLocaleDateString()); // -> 2020-10-19
console.log(d.toLocaleString()); // -> 2020-10-19 10:02:03
console.log(d.toLocaleTimeString()); // -> 10:02:03
console.log(d.toTimeString()); // -> 10:02:03 GMT+0900 (GMT+09:00)
console.log(d.toUTCString()); // -> Mon, 19 Oct 2020 01:02:03 GMT

d = new Date(2020, 9, 19, 10, 2, 3);
s = `${d.getFullYear()}/${d.getMonth()+1}/${d.getDate()} ${d.getHours()}:${d.getMinutes()}:${d.getSeconds()}`
console.log(s); // -> 2020/10/19 10:2:3

s = `${d.getFullYear()}/${(d.getMonth()+1).toString().padStart(2, '0')}/${d.getDate().toString().padStart(2, '0')} ${d.getHours().toString().padStart(2, '0')}:${d.getMinutes().toString().padStart(2, '0')}:${d.getSeconds().toString().padStart(2, '0')}`
console.log(s); // -> 2020/10/19 10:02:03

// 文字列から日付への変換
s = "2020/10/19 01:02:03";
d = new Date(Date.parse(s));
console.log(d.toLocaleString());

// momentの利用
moment = require('moment');
d = moment('2020-10-19', 'YYYY-MM-DD');
console.log(d.format());
console.log(d.format('YYYY/MM/DD HH:mm:ss'));

// luxonの利用
luxon = require('luxon');
d = luxon.DateTime.local(2020, 10, 19);
console.log(d.toString());
console.log(d.toFormat('yyyy/MM/dd HH:mm:ss'));
