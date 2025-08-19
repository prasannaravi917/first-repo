class sttack {
    public int strStr(String haystack, String needle) {
        int size=haystack.length(),size1=needle.length(),i=0;
        if(size==1 && haystack.equals(needle)==true)
        {
            return 0;            
        }
        if(size1 ==0)
        {
            return 0;
        }
        for(i=0;i<size-size1+1;i++)
        {
            if(needle.equals(haystack.substring(i,i+size1)))
            {
                    return i;
            }
        }
    return -1;
    }
}