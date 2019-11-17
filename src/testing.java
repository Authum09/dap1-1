import java.util.Random;

public class testing {

    public static void main(String[] args){
        LectureWithSortAlgorithms dap1 = new LectureWithSortAlgorithms( "DAP 1", 7 );
/*        dap1.add( new Student( "A", "M", 1775 ) );
        Random generator = new Random();
        int regNo;

        for(int i = 0; i < 10000; i++){
           regNo = generator.nextInt();

            dap1.add( new Student( "qwe", "M", regNo ) );

        }*/

        dap1.add( new Student( "A", "M", 17 ) );
        dap1.add( new Student( "B", "Inf", 22 ) );
        dap1.add( new Student( "D", "M", 11 ) );
        dap1.add( new Student( "D", "Inf", 14 ) );
        dap1.add( new Student( "D", "Ph", 19 ) );
        dap1.add( new Student( "D", "Inf", 12 ) );
        dap1.add( new Student( "A", "Inf", 8 ) );


        dap1.betterSwapSortByName();
        dap1.show();
        System.out.println("Counter: " + dap1.counter);
    }




    }
