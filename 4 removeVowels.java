public class Main
{
    public static void removeVowels(StringBuilder str){
        int n = str.length();
        for(int i=0; i<n; i++){
            //StringBuilder c = str.charAt(i);
            if(!(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U' )){
                continue;
            }
            str.setCharAt(i, ' ');
        }
        System.out.println(str);
    }
    
    
	public static void main(String[] args) {
	    StringBuilder str = new StringBuilder("ShubhamTadas");
	    StringBuilder str1 = new StringBuilder("YaiishBhoikareia");
	    removeVowels(str);
	    removeVowels(str1);
	}
}
