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

:fist: 可以先把长的字符串a中的所有字符都放入一个散列表中，然后轮询短字符串b，看b中的每个字符是否都在散列表中，如果都在，说明长字符串a包含短字符串b；否则，说明不包含    
:fist: 进一步，可以使用位运算（26位整数表示）位长字符串a计算出一个“签名”，再逐一对短字符串b中的字符放到a中进行查找。



:sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles:
#### 题目三：回文判断 **Palindrome** 类  

**题目描述：**    :point_right:   

 给定一个字符串，如何判断这个字符串是否是回文串？  
 
**解法：两头往中间扫**   
 :fist: 给定一个字符串，定义两个分别指向字符串的头和尾的指针，然后让这两个指针都往字符串的中间扫描，扫描的过程中。 如果头和尾锁指的字符至始至终都一样，即该字符串尾为回文串。  
 
 
 
 :sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles::sparkles:
#### 题目四：最长回文子串 **LongestPalindrome** 类  

**题目描述：**    :point_right:   

 给定一个字符串，求它的最长回文子串的长度。 
 
**解法：中心扩展法**   
 :fist: 如何进行高效的判断呢？试想，如果一段字符串是回文串，那么以某个字符为中心的前缀和后缀必定是相同的。例如：以回文串“aba”为例，以b为中心，它的前缀和后缀都是a。**因此，我们可以枚举中心位置，然后再在该位置上扩展，记录并更新得到的最长回文串的长度。**  
 
 