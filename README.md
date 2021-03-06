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
 
**解法一：中心扩展法**   
 :fist: 如何进行高效的判断呢？试想，如果一段字符串是回文串，那么以某个字符为中心的前缀和后缀必定是相同的。例如：以回文串“aba”为例，以b为中心，它的前缀和后缀都是a。**因此，我们可以枚举中心位置，然后再在该位置上扩展，记录并更新得到的最长回文串的长度。**      
 

**解法一：马拉车算法**   

这个马拉车算法Manacher's Algorithm是用来查找一个字符串的**最长回文子串的线性方法**，由一个叫Manacher的人在1975年发明的，这个方法的最大共享是在于将
时间复杂度提升到了线性，这是非常了不起的。如何在一个字符串中找到最长回文子串呢，可以以每一个字符为中心，向两遍寻找回文子串，在遍历完整个数组的时候，就可以找到最长回文子串。
但是这个方法的时间复杂度是O(n* n),并不是很搞笑，下面我们来看时间复杂度为O（n）的马拉车算法。  

由于回文串的长度可奇可偶，比如“bob”是奇数形式的回文，“noon”是偶数形式的回文，马拉车算法的第一步是预处理，做法是在每一个字符的左右都加上一个特殊字符，比如加上'#'，那么  

bob --> #b#o#b#o#b#  
noon --> #n#o#o#n#  

这样做的好处是不论原字符串是奇数还是偶数个，处理之后得到的字符串的个数都是奇数个，这样就不用分情况讨论了额，而可以一起搞定。    

接下来，我们还需要和处理后的字符串t等长的数组p，其中p[i]表示以t[i]字符为中心的回文子串的半径，若P[i]=1,则该回文子串就是t[i]本身，那么我们来看看一个简单的例子：  

```

0  1  2  3  4  5  6  7  8  9  10 11 12   
#  1  #  2  #  2  #  1  #  2  #  2  #    
1  2  1  2  5  2  1  6  1  2  3  2  1  

```


为啥我们关心回文子串的半径呢？看上面这个例子，以中间的'1'位中心的回文串“#2#2#1#2#2#”的半径是6，而为添加井号的回文串为“22122”，长度为5，为半径-1。
这个是普遍的规律，可以多举几个例子就知道了。所以我们只要找到了最大半径，就知道回文子串的字符个数了。只知道长度无法确定子串，我们还需要知道子串的起始位置。  


我们还是先来看中间的 '1' 在字符串 "#1#2#2#1#2#2#" 中的位置是7，而半径是6，貌似7-6=1，刚好就是回文子串 "22122" 在原串 "122122" 中的起始位置1。那么我们再来验证下 "bob"，"o" 在 "#b#o#b#" 中的位置是3，但是半径是4，这一减成负的了，肯定不对。所以我们应该至少把中心位置向后移动一位，才能为0啊，那么我们就需要在前面增加一个字符，这个字符不能是井号，也不能是s中可能出现的字符，所以我们暂且就用美元号吧，毕竟是博主最爱的东西嘛。这样都不相同的话就不会改变p值了，那么末尾要不要对应的也添加呢，其实不用的，不用加的原因是字符串的结尾标识为'\0'，等于默认加过了。那此时 "o" 在 "$#b#o#b#" 中的位置是4，半径是4，一减就是0了，貌似没啥问题。我们再来验证一下那个数字串，中间的 '1' 在字符串 "$#1#2#2#1#2#2#" 中的位置是8，而半径是6，这一减就是2了，而我们需要的1，所以我们要除以2。之前的 "bob" 因为相减已经是0了，除以2还是0，没有问题。再来验证一下 "noon"，中间的 '#' 在字符串 "$#n#o#o#n#" 中的位置是5，半径也是5，相减并除以2还是0，完美。可以任意试试其他的例子，都是符合这个规律的，最长子串的长度是半径减1，起始位置是中间位置减去半径再除以2。


那么下面我们来看如何求P数组，需要新增两个辅助变量mx和id，其中id为能延伸到最右端的位置的那个回文子串的中心点位置，mx是回文串能延伸到的最右端的位置，这个算法的最核心的一行如下：

```
p[i] = mx > i ? min(p[2 * id - i], mx - i) : 1;
```

可以这么说，这行要是理解了，那么马拉车算法基本上就没啥问题了，那么这一行代码拆开来看就是

如果 mx > i, 则 p[i] = min( p[2 * id - i] , mx - i )  

否则，p[i] = 1  

当 mx - i > P[j] 的时候，以S[j]为中心的回文子串包含在以S[id]为中心的回文子串中，由于 i 和 j 对称，以S[i]为中心的回文子串必然包含在以S[id]为中心的回文子串中，所以必有 P[i] = P[j]，见下图。      

![image](https://github.com/xiaojie570/Algorithm/blob/master/algorithm/picture/1.png)

当 P[j] >= mx - i 的时候，以S[j]为中心的回文子串不一定完全包含于以S[id]为中心的回文子串中，但是基于对称性可知，下图中两个绿框所包围的部分是相同的，也就是说以S[i]为中心的回文子串，其向右至少会扩张到mx的位置，也就是说 P[i] = mx - i。至于mx之后的部分是否对称，就只能老老实实去匹配了。  
 
 ![image](https://github.com/xiaojie570/Algorithm/blob/master/algorithm/picture/2.png)
 
 对于 mx <= i 的情况，无法对 P[i]做更多的假设，只能P[i] = 1，然后再去匹配了。  






