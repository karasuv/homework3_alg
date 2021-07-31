public class searchNumber {


        public static int search(Integer[] arr){
            int start = 0;
            int end = arr.length-1;

            while (true) {
                int base = (start + end) / 2;
                if(base == 0&&end<=start) return (base+1);
                // if (start == end) return  (base + 1);
                if (end - start <2 ) {
                    if (arr[end]==end+1) return (arr[end]+1);
                    if (arr[start]==start+1)return (arr[start]+1);
                }

                if (arr[base] != base+1) {
                    end = base - 1;
                } else {
                    start = base + 1;
                }

            }



        }









}
