'''
题目：写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
'''

'''
思路一：用sum函数，但是特别注意sum()求和里面是个[]列表对象，直接输入num，num2是不行的

26ms
5632k
'''


class Solution:
    def Add(self, num1, num2):
        while num2:
            sum = num1 ^ num2  # 异或运算相当于只求和不进位
            carray = (num1 & num2) << 1  # 与操作，并向左移一位，相当于求进位
            num1 = sum
            num2 = carray
        return num1


num1 = 50;
num2 = 7;

# solution = Solution();
sum = Solution().Add(num1, num2);

print(sum)
