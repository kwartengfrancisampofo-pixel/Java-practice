class MatrixQuestions {
    public static void main(String[] args) {
        int[][] K = {{2,3,4},{5,6,7},{8,9,1}};
        int[][] J = {{3,4,5},{7,8,9},{2,1,3}};
        
        // Q1 
        int productDiagonal = (K[2][0] * K[1][1] * K[0][2]) * (J[2][0] * J[1][1] * J[0][2]);
        System.out.println("The product of the leading diagonals of K and J is " + productDiagonal);
        
        // Q2 
        int differenceDiagonal = (J[0][0] * J[1][1] * J[2][2]) - (K[0][0] * K[1][1] * K[2][2]);
        System.out.println("The difference of the products of trailing diagonals of J and K is " + differenceDiagonal);
        
        //  Q3 
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                int temp = K[row][col];      // Store K's value (single int)
                K[row][col] = J[row][col];   // Put J's value in K
                J[row][col] = temp;          // Put stored value in J
            }
        }
        System.out.println("Tables K and J have been swapped.");
        
        // Q4 
        int differenceProduct = (K[2][0] * K[1][1] * K[0][2]) - (K[0][0] * K[1][1] * K[2][2]);
        System.out.println("The difference of the products of leading diagonals and trailing diagonals of K is " + differenceProduct);
        
        // Q5 
        int sumK = 0;  // Declare OUTSIDE loop
        int sumJ = 0;
        
        // Sum all elements 
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                sumK += K[r][c];  // Add the VALUE, not the index
                sumJ += J[r][c];
            }
        }
        
        // Calculate averages AFTER loops finish
        double meanK = sumK / 9.0;  // Use 9.0 for decimal division
        double meanJ = sumJ / 9.0;
        double tableMeans = (meanK + meanJ) / 2;
        
        System.out.println("The mean of the averages is: " + tableMeans);
    }
}