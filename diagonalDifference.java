public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    
    int rightDiag =0;
    int leftDiag=0;
    
    for(int i=0;i<arr.size();i++){
        for(int j=0; j<arr.size();j++){
            if (i==j){
                leftDiag+=arr.get(i).get(j);
            }
            if (i+j==arr.size()-1){
                rightDiag+=arr.get(i).get(j);
            }
        }
    }
    
    int absVal=leftDiag-rightDiag;
    if (absVal<0){
        absVal = absVal*-1;
    }
    
    
    return absVal;
    
    }

}