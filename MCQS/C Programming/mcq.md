Q1:-
```
#include "stdio.h"
int main() 
{ 
    int x, y = 5, z = 5; 
    x = y == z; 
    printf("%d", x); 
    getchar(); 
    return 0; 
}
```
Output- 1<br>

Q2:-
```
#include <stdio.h>
// Assume base address of "GeeksQuiz" to be 1000
int main()
{
   printf(5 + "GeeksQuiz");
   return 0;
}
```
Output- Quiz <br>

Q3:-
```
#include <stdio.h>
int main()
{
    int i = 3;
    printf("%d", (++i)++);
    return 0;
}
```
Output- Compilation Error because in C, prefix and postfix operators need l-value to perform operation and return r-value. The expression (++i)++ when executed increments the value of variable i(i is a l-value) and returns r-value. The compiler generates the error(l-value required) when it tries to post-incremeny the value of a r-value. <br>

Q4:-
```
#include <stdio.h>
#if X == 3
    #define Y 3
#else
    #define Y 5
#endif
 
int main()
{
    printf("%d", Y);
    return 0;
}
```
Output- 5 <br>

Q5:-
```
struct { 
    short s[5]; //takes 2*5 = 10 bytes
    union { 
         float y; //takes 4 bytes
         long z; //takes 8bytes
    }u; 
} t; //takes 10+8 = 18bytes
```
Output- 18 <br>

Q6:-
```
In C, parameters are always 
```
Output- Passed by Value <br>

Q7:-
```
Which of the following is true about return type of functions in C?
```
Output- Functions can return any type except array and functions <br>

Q8:-
```
Which of the following is not a storage class specifier in C?
```
Output- Volatile <br>

Q9:-
```
Which of the following is not a logical operator?
```
Output- | <br>

Q10:-
```
Which file is generated after pre-processing of a C program?
```
Output- .i <br>

Q2:-
```
```
Output- 

Q2:-
```
```
Output- 

Q2:-
```
```
Output- 

Q2:-
```
```
Output- 

Q2:-
```
```
Output- 

Q2:-
```
```
Output- 

Q2:-
```
```
Output- 

