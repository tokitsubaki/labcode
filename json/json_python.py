import json
import pprint

with open('./data.json', 'r') as f:
    j = json.load(f)
    print(j)

with open('./data.json', 'r') as f:
    s = f.read()
    j = json.loads(s)
    print(j)

print(j['string'])
print(j['int'])
print(j['bool'])
print(j['null'])

print(j['array'][0]['no'])
print(j['array'][0]['name'])
print(j['array'][1]['no'])
print(j['array'][1]['name'])

for item in j['array']:
    print(item['no'])
    print(item['name'])

print(j['object']['no'])
print(j['object']['name'])

j['string2'] = "文字列2"
j['int2'] = 2021
j['bool2'] = False
j['null2'] = None
j['array'].append({'no': 4, 'name': 'Ruby'})
j['object']['object2'] = {'no': 5, 'name': 'Go'}
pprint.pprint(j, width=80)

del j['string2']
del j['int2']
del j['bool2']
del j['null2']
del j['array'][2]
del j['object']['object2']
pprint.pprint(j, width=80)

s = json.dumps(j, ensure_ascii=False)
print(s)