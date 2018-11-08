### 字符串
:sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles:
#### 题目一：字符串的旋转 **ReverseString** 类

**题目描述：**    :point_right:  
  给定一个字符串，要求将字符串前面的若干个字符移到字符串的尾部。  
  例如：将字符串“abcdef”的前3个字符'a'，'b'，'c'移动到字符串的尾部，那么原字符串将变成"defabc"。  
  
**解法：三步反转**    :point_right:  

既然题目要求将字符串前面的部分原封不动的移动到字符串的尾部，那么是否可以把需要移动的部分跟不需要移动的部分分开处理呢？  
例如：可以先将一个字符串分割成两个部分，然后将这两个部分的字符串分别反转，最后再对整个字符串进行整体反转，即可以解决字符串旋转的问题。  

如题目描述的例子：给定字符串“abcdef”，若要将“def”移动到“abc“前面，只需要按照下述3个步骤操作即可。  :point_right:   

:one: 将原字符串分为X和Y两部分。其中X为“abc”,Y为“def”  
:two: 将X的所有字符反转，即相当于反转“abc”得到“cba”；在将Y的所有字符也反转，即相当于反转“def”得到“fed”  
:three: 最后，将上述步骤得到的结果再给予整体反转，即整体反转“cbafed”得到“defabc”，这样，就实现了字符串的反转。  



:sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles:
#### 题目二：字符串的包含 **ContainString** 类

**题目描述：**    :point_right:  
  给定一长字符串a和一个短字符串b。请问，如何快速地判断出短字符串b中的所有字符是否都在长字符串a中？  
为了简单起见，假设输入的字符串只包含大写英文字母。下面举几个例子。  
:fist: 如果字符串a是“ABCD”，字符串b是“BAD”，答案是true，因为字符串b中的字母都在字符串a中，或者说b是a的真子集。  
:fist: 如果字符串a是“ABCD”，字符串b是“BCE”，答案是false，因为字符串b中的字母E不在字符串a中。  
:fist: 如果字符串a是“ABCD”，字符串b是“AA”，答案是true，因为字符串b中的字母A在字符串a中。    

**解法一：排序后轮询**    :point_right:  

**解法二：位运算法**    :point_right:  

既然题目要求将字符串前面的部分原封不动的移动到字符串的尾部，那么是否可以把需要移动的部分跟不需要移动的部分分开处理呢？  
例如：可以先将一个字符串分割成两个部分，然后将这两个部分的字符串分别反转，最后再对整个字符串进行整体反转，即可以解决字符串旋转的问题。  

如题目描述的例子：给定字符串“abcdef”，若要将“def”移动到“abc“前面，只需要按照下述3个步骤操作即可。  :point_right:   

:one: 将原字符串分为X和Y两部分。其中X为“abc”,Y为“def”  
:two: 将X的所有字符反转，即相当于反转“abc”得到“cba”；在将Y的所有字符也反转，即相当于反转“def”得到“fed”  
:three: 最后，将上述步骤得到的结果再给予整体反转，即整体反转“cbafed”得到“defabc”，这样，就实现了字符串的反转。  

