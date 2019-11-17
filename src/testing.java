public class testing {

    public static void main(String[] args){
        LectureWithSortAlgorithms dap1 = new LectureWithSortAlgorithms( "DAP 1", 7 );
        dap1.add( new Student( "A", "M", 17 ) );
        dap1.add( new Student( "B", "Inf", 22 ) );
        dap1.add( new Student( "D", "M", 11 ) );
        dap1.add( new Student( "D", "Inf", 14 ) );
        dap1.add( new Student( "D", "Ph", 19 ) );
        dap1.add( new Student( "D", "Inf", 12 ) );
        dap1.add( new Student( "A", "Inf", 8 ) );

        dap1.countAndCompareSortByName();
    }
}
