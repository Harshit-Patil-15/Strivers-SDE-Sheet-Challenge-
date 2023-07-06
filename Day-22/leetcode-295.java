class MedianFinder {
        PriorityQueue<Integer> maxHeap,minHeap;
    boolean even;
    public MedianFinder() {
        maxHeap=new  PriorityQueue<>(Collections.reverseOrder());
         minHeap=new  PriorityQueue<>();
        even=true;
    }
    
    public void addNum(int num) {
        if(even==true){
            minHeap.offer(num);
            maxHeap.offer(minHeap.poll());
        }else{
            maxHeap.offer(num);
            minHeap.offer(maxHeap.poll());
        }
        even=!even;
    }
    
    public double findMedian() {
        if(even==true){
            return (maxHeap.peek()+minHeap.peek())/2.0;
        }else{
            return (double)maxHeap.peek();
        }
    }
}
