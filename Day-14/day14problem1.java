static int[] previousSmaller(int a[]) {
		int ans[] = new int[a.length];
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		int i = 0;
		for(int e: a) {
			while(!stack.isEmpty() && stack.peek() >= e) {
				stack.pop();
			}
			if(stack.isEmpty()) {
				ans[i] = -1;
			} else {
				ans[i] = stack.peek();
			}
			stack.push(e);
			i++;
		}
		return ans;
}