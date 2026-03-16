// Next Greater Element
// Next Smaller Element
// Stock Span
// Daily Temperatures 
//  => MONOTONIC STACK

// Decreasing monotonic: values added in decreasing order. This is used when asked for next greater.
// Increasing monotonic: values added in increasing order. This is used when asked for next smaller.

// Given case, Next Greater => Decreasing monotonic.
// Stack => keep track of elements in array that is > than its next element
// logic to maintain stack: keep on popping peek until incoming (n[i]) < peek. 
// popeed element used for further logic to arrive at output.

public int[] findNextGreaterElement(int[] subsetNumbers, int[] fullNumbers) {

    Map<Integer, Integer> map = new HashMap<>();
    Stack<Integer> stack = new Stack<>();

    for (int num : fullNumbers) {

        while (!stack.isEmpty() && num > stack.peek()) { //O(n)
            map.put(stack.pop(), num);
        } 

        stack.push(num); //O(n)
    }

    int[] result = new int[subsetNumbers.length];

    for (int i = 0; i < subsetNumbers.length; i++) {
        result[i] = map.getOrDefault(subsetNumbers[i], -1);
    }

    return result;
}

// => O(n)
// subsetNumbers = [10,3,6,1,9]
// fullNumbers   = [3,10,1,6,9,5,7]
// result = [-1,10,9,6,-1]