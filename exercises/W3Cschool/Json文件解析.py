# 写入 JSON 数据
import json

filePath = '../../resources/json/data.json'

data = {
    'no': 1,
    'name': 'W3CSchool',
    'url': 'http://www.w3cschool.cn'
}

# 写入 JSON 数据
# with open(filePath, 'w') as f:
#     json.dump(data, f)

# 读取数据
with open(filePath, 'r') as f:
    jsonData = json.load(f)
    print("url: " + jsonData['url'])
