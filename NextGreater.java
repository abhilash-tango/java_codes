package goal.array;import java.util.Stack;

public class NextGreater {

public void nextGreater(int[] input) {
int length = input.length;
for (int i = 0; i < input.length; i++) {
int next = -1;
for (int j = i + 1; j < length; j++) {
if (input[j] > input[i]) {
next = input[j];
break;
}
}
System.out.println(input[i] + " Next grater " + next);
}
}

public void nextGreaterStack(int[] input) {
Stack<Integer> stack = new Stack<Integer>();
stack.push(input[0]);
for (int i = 1; i < input.length; i++) {
int next = input[i];
int element = stack.pop();
while (element < next) {
System.out.println(element + " Next Greater " + next);
if (stack.isEmpty())
break;
element = stack.pop();
}
if (element > next) {
stack.push(element);
}
stack.push(next);
}
while (!stack.isEmpty()) {
System.out.println(stack.pop() + " Next Greater -1");
}

}

public void nextGreaterReverse(int[] input) {
Stack<Integer> stack = new Stack<Integer>();
int len = input.length;
stack.push(input[len - 1]);
System.out.println(input[len - 1] + " Next Greater -1");
for (int i = len - 2; i > 0; i--) {
while (!stack.isEmpty() && input[i] > stack.peek()) {
stack.pop();
}
if (stack.isEmpty()) {
System.out.println(input[i] + " Next Greater -1");
} else
System.out.println(input[i] + " Next Greater " + stack.peek());
stack.push(input[i]);
}

}

public static void main(String[] args) {

int[] input = new int[] { 10, 100, 9, 2, 5, 25, 4, 40 };

NextGreater nextGreater = new NextGreater();

nextGreater.nextGreater(input);



}

}