import yaml

# YAMLファイル読み込み
with open("./data.yaml") as file:
    yamldata = yaml.safe_load(file)

print(yamldata)

# YAMLデータの参照
print(yamldata['string'])
print(yamldata['int'])
print(yamldata['bool'])
print(yamldata[None])

print(yamldata['array'][0]['index'])
print(yamldata['array'][0]['name'])
print(yamldata['array'][1]['index'])
print(yamldata['array'][1]['name'])

for item in yamldata['array']:
    print(item['index'])
    print(item['name'])

print(yamldata['object']['index'])
print(yamldata['object']['name'])

# YAMLデータの追加
yamldata['string2'] = "文字列2"
yamldata['int2'] = 2021
yamldata['bool2'] = False
yamldata['null2'] = None
yamldata['array'].append({'index': 4, 'name': 'Ruby'})
yamldata['object']['object2'] = {'index': 5, 'name': 'Go'}
print(yaml.dump(yamldata, allow_unicode=True))

# YAMLデータの削除
del yamldata['string2']
del yamldata['int2']
del yamldata['bool2']
del yamldata['null2']
del yamldata['array'][2]
del yamldata['object']['object2']
print(yaml.dump(yamldata, allow_unicode=True))

s = '''
text: テキスト
num: 1
'''
y = yaml.safe_load(s)
print(y)

str = yaml.dump(y, allow_unicode=True)
print(str)

str = yaml.dump(y, allow_unicode=True, default_flow_style=True)
print(str)