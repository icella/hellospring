package helloSpring.str;

public class QueryStr {

	public static String getTotalSql(String[] fields) 
    {
        String selectStr = "select ";
        for(int i=0;i<fields.length;i++)
        {
            selectStr = selectStr + "sum(queryObj." + fields[i] + "),";
        }
        selectStr = selectStr.substring(0, selectStr.length()-1);
        selectStr = selectStr + " from " ;
        return selectStr;
    }
	
	public static void main(String[] args){
		System.out.println(getTotalSql(new String[] {"id", "name"}));
	}
	
}
