class Solution {
    public int search(ArrayReader reader, int target) {
        if(reader.get(0) == target) return 0;

        int low = 0 , high = 1;
        while(reader.get(high) < target) {
            low = high;
            high *= 2; // (or) right <<=1; (   left shifting on 2 causes 2 power the int)
        }

        int mid , num ;

        while(low <= high){
            //mid = (high+low)/2; // (Not The Result We Want) Causes Integer Overflow 
            mid = low + (high-low)/2; // Result WE Want

            num = reader.get(mid);
            if(num == target) return mid;
            if(num < target) low = mid+1;
            else high = mid-1; 
        }

        return -1;

    }
}
