class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<Boolean>(candies.length);

        int result=0;
        
        for(int i=0; i<candies.length; i++)
        {
            if(result<candies[i])
            {
                result= candies[i];
            }
            
        }

        for (int i=0; i<candies.length; i++)
        {
            if((candies[i]+extraCandies)>=result){
                list.add(true);
            }
            else
            {
                list.add(false);
            }
            
        }return list;   
    }
}