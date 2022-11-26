public class Main
{
	public static int[] oddArray() {
		int[] arrA = new int[10];
		int schet=0;
        for (int i = 21; i > 2; i--) {
          	if ( i % 2 == 1 ){
          		arrA[schet++]=i;
          	} 
        }
        return arrA;

	}

	public static void nicePrint(double[][] arr) {
		for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.printf("%9.6f ",arr[i][j]);
            }
            System.out.println();
        }

	}

	public static void main(String[] args) {
	    int[] a = oddArray();
		float[] x = new float[19];

		for (int i = 0; i < x.length; i++){
            x[i] = (float)(Math.random()*(7+4+1))-7; // returns [0, 1)
            if (x[i]>4) x[i] = 4;   
        }

        double[][] c = new double[10][19];
        double oneoff;

        for (int i = 0; i < a.length; i++){
        	for (int j = 0; j < x.length; j++){
        		switch (a[i]){
        	        case 13:
        	            c[i][j] = Math.log(Math.sqrt(Math.abs(x[j])));
        	            break;
        	        case 3: case 5: case 11: case 19: case 21:
        	            oneoff = (x[j]-1.5)/11;
				        c[i][j] = Math.pow((Math.log(Math.acos(oneoff)))/(1-(1/3)*(0.5+Math.asin(oneoff))), Math.cbrt(Math.atan(oneoff)));
				        break;
        	        default:
        	            oneoff = (x[j]-1.5)/11;
				        c[i][j] = Math.pow(Math.log(Math.pow((Math.acos(oneoff+1)/4), 2)), 4*(Math.pow((Math.cbrt(Math.cbrt(x[j]))/2),3)-0.25));
        		}
        	    
        	}
        }
       
        nicePrint(c);

	}
}

