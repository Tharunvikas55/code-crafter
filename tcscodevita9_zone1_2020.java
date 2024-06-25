// TCS CodeVita 9 ( Zone 1) 2020 | Constellation
// Three characters {#, *, . } represents a constellation of stars and galaxies in space.
// Each galaxy is demarcated by # characters. There can be one or many stars in a given galaxy. 
//Stars can only be in the shape of vowels {A, E, I, O, U}. A collection of * in the shape of the vowels is a star. 
//A star is contained in a 3×3 block. Stars cannot be overlapping. The dot (.) character denotes empty space.
// Given a matrix mat[][] of dimensions 3×N consisting of {#, *, .} character, the task is to find the galaxy and stars within them.

// Input: N = 18, mat[][] = {{* . * # * * * # * * * # * * * . * .}, {* . * # * . * # . * . # * * * * * *}, {* * * # * * * # * * * # * * * * . *}}
// Output: U#O#I#EA
// Explanation:
// It can be seen that the stars make the image of the alphabets U, O, I, E and A respectively.

// Input: N = 12, mat[][] = {{* . * # . * * * # . * .}, {* . * # . . * . # * * *}, {* * * # . * * * # * . *}}
// Output: U#I#A
// Explanation:
// It can be seen that the stars make the image of the alphabet U, I and A.

//import java.util.*;

 class tcscodevita9_zone1_2020{
    public static String find(char[] [] arr)
    {
        if(arr[0][0]=='.')
        return "A";
        else if(arr[0][1]=='.'&&arr[1][1]=='.')
        return "U";
        else if(arr[1][0]=='.'&& arr[1][2]=='.')
        return "I";
        else if(arr[1][1]=='.')
        return "O";
        else 
        return "E";
    }
    public static void main(String[] args)
    {
        //Scanner sc=new Scanner(System.in);
        //int N=sc.nextInt();
        // char [][] mat=new char[3][N];
        char[][] mat = {
            {'*', '.', '*', '#', '*', '*', '*', '#', '*', '*', '*', '#', '*', '*', '*', '.', '*', '.'},
            {'*', '.', '*', '#', '*', '.', '*', '#', '.', '*', '.', '#', '*', '*', '*', '*', '*', '*'},
            {'*', '*', '*', '#', '*', '*', '*', '#', '*', '*', '*', '#', '*', '*', '*', '*', '.', '*'}
        };
        // char[][]  mat={{'*', '.', '*', '#', '.', '*', '*', '*', '#', '.', '*' ,'.'}, {'*', '.', '*', '#', '.', '.', '*', '.', '#', '*', '*', '*'}, {'*', '*', '*', '#', '.', '*', '*', '*', '#', '*', '.', '*'}};
        StringBuilder str=new StringBuilder();
        for(int i=0;i<mat[0].length;i++)
        {
            if(mat[0][i]=='#')
            str.append('#');
            else if (i + 2 < mat[0].length && (mat[0][i] == '*'||mat[0][i+2]=='.')){
                char[][] arr={
                    {mat[0][i],mat[0][i+1],mat[0][i+2]},
                    {mat[1][i],mat[1][i+1],mat[1][i+2]},
                    {mat[2][i],mat[2][i+1],mat[2][i+2]}
                };
                str.append(find(arr));
                i+=2;
                
            };
        }
                //System.out.print(mat[i][j]);
            System.out.print(str.toString());

    }
}



//* . * # * * * # * * * # * * * . * . * . * # * . * # . * . # * * * * * * * * * # * * * # * * * # * * * * . * 