'''
输出的是一个元组，第一个元素是所查月份的第一天对应的是星期几（0-6），第二个元素是这个月的天数。
该实例输出的意思为 2020 年 7 月份的第一天是星期3，该月总共有 31 天。
'''
import calendar

monthRange = calendar.monthrange(2020, 7)
print(monthRange)

