public class Time_space_complexity {
    public static void main (String args[]){


//📌1.Time complexcity:
        /*defination:
        time commplexity is the growth of algorithm  running time when input is increse 

        why :
        to compare algorithm 
        choose efficient solution
        handle large input

        remeber:
        time complexity!=actual time
        time complexity = growthof operations

📌2.Constant Time Complexity:O(1)
        defination:
        algorithm take constant time for executiontime does not change with input n

        becouse:
        opration become fixed

        example:o(1)
        for(int i=0;i<100;i++)
        int first = arr[0];
        int sum = a + b;

📌3.Big O Notation:

      3.1  defination:
        big omehga defines upperbound (worst time) comlexity of algo
        -algo max kiti time gheu shakto te dakvna

        3.2example:
        linear search:
        first element --> best casee o(1)
        last ele/not found--> wrost case o(n)

        3.3common big O's:
        O(1)  <  O(log n)  <  O(n)  <  O(n²)
        Faster ------------------> Slower

        3.4Best Case    → Minimum Time
        Average Case → Expected Time
        worst Case   → Maximum Time

        3.5Big O (O) → Worst Case (Upper Bound)
        Big Omega (Ω) → Best Case (Lower Bound)
        Big Theta (Θ) → Average/Exact Case (Tight Bound)


📌4.Rules to Calculate Time Complexity 

        Rule 1 : Ignore Constants
        for(int i=0; i<100; i++)
        ➡️TC:O(1)
        
        rule 2 : Keep Highest order:
        O(n^2+n+10)
        ➡️TC:O(n²)

        Rule 3 :Drop Constant Multiplication
        o(2n)
        O(10n)
        ➡️TC:O(n)

        Rule 4 : Different Loops → Add

        for(int i=0;i<n;i++){}
        for(int i=0;i<n;i++){}

        O(n+n)=O(2n)
        ➡️TC:o(n)

        Rule 5 : Nested Loops → Multiply

        for(int i = 0 ; i < n  ; i ++){
          for(int j = 0 ; j < n : j ++){
           }
        }

       ➡️ O(n*n)=o(n²)

      rule 6: Consecutive Different Loops

      for(i=0;i<n;i++){}
      for(i=0;i<m;i++){}

      ➡️ O(n+m)
      
      rule 7: 3. Logarithmic Growth (Multiply/Divide)
        
      1.for(int i=1;i<n;i*=2or i/2)

      2. while(i<n){
            i*=2;or i/2
        }
      ➡️ O(log n)   
     
      rule 8:If-Else
      if(condition){
            // O(n)
        }
        else{
            // O(1)
        }
        ➡️TC:o(n)

        remeber:
            1. Ignore Constants
            2. Keep Highest Power
            3. Drop Constant Multiplication
            4. Separate Loops → Add
            5. Nested Loops → Multiply
            6. while(i++) → O(n)
            7. while(n/=2) → O(log n)
            8. while(i*=2) → O(log n)
            9. if-else → Take Maximum
            10. Recursion → Solve Recurrence

📌5.Common Time Complexities:
        
        O(1)      → Constant Time
        ↓
        O(log n)  → Logarithmic Time
        ↓
        O(n)      → Linear Time
        ↓
        O(n log n)→ Linearithmic Time
        ↓
        O(n²)     → Quadratic Time
        ↓
        O(2ⁿ)     → Exponential Time
        ↓
        O(n!)     → Factorial Time

        Best/Fastest^
        Worst/Slowest ↓


Recursive time complexity:
        🚀 Golden Rule

     Code baghun fakta 2 goshti bagh:

        Ek recursive call aahe ki don?
        1 call → O(n) kiwa O(log n)
        2 calls → Mostly O(2ⁿ)
        Parameter kasa change hoto?
        n-1 → O(n)
        n/2 → O(log n)
        2 recursive calls → O(2ⁿ)   
        
        
                Golden Rule
        fun(n-1)           → O(n)

        fun(n/2)           → O(log n)

        fun(n-1)+fun(n-1)  → O(2ⁿ)

        fun(n/2)+fun(n/2)  → O(n)

        Loop + fun(n-1)    → O(n²)

        Loop + fun(n/2)    → O(n)

        fib(n-1)+fib(n-2)  → O(2ⁿ)

*/

    }
}

