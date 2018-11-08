### 字符串

#### 题目一：字符串的旋转

题目描述：  
  给定一个字符串，要求将字符串前面的若干个字符移到字符串的尾部。  
  例如：将字符串“abcdef”的前3个字符'a'，'b'，'c'移动到字符串的尾部，那么原字符串将变成"defabc"。  
  
解法：三步反转  

既然题目要求将字符串前面的部分原封不动的移动到字符串的尾部，那么是否可以把需要移动的部分跟不需要移动的部分分开处理呢？  
例如：可以先将一个字符串分割成两个部分，然后将这两个部分的字符串分别反转，最后再对整个字符串进行整体反转，即可以解决字符串旋转的问题。  

如题目描述的例子：给定字符串“abcdef”，若要将“def”移动到“abc“前面，只需要按照下述3个步骤操作即可。  

（1）将原字符串分为X和Y两部分。其中X为“abc”,Y为“def”  
（2）将X的所有字符反转，即相当于反转“abc”得到“cba”；在将Y的所有字符也反转，即相当于反转“def”得到“fed”  
（3）最后，将上述步骤得到的结果再给予整体反转，即整体反转“cbafed”得到“defabc”，这样，就实现了字符串的反转。  

