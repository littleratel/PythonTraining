'''
用sum函数，但是特别注意sum()求和里面是个[]列表对象，直接输入num，num2是不行的
'''

params = {"server": "mpilgrim", "database": "master", "uid": "sa", "pwd": "secret"}
lst = ["%s=%s" % (k, v) for k, v in params.items()]
print(lst)

s = ";".join(["%s=%s" % (k, v) for k, v in params.items()])
print(s)
