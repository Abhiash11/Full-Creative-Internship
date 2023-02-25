package week3;

class ForEachExample2     
{
    public static void main(String[] arg)
    {
        
            int[] marks = { 125, 132, 95, 116, 110 };
              
            int highest_marks = maximum(marks);
            System.out.println("The highest score is " + highest_marks);
        
    }
    public static int maximum(int[] numbers)
    { 
        int max = numbers[0];
          
        // for each loop
        for (int num : numbers) 
        {
            if (num > max)
            {
                max = num;
            }
        }
    return max;
    }
}