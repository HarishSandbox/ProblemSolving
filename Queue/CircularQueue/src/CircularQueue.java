class CircularQueue {

  int[] queue;
  int capacity;
  int front;
  int rear;
  int currSize;

  /** Initialize your data structure here. Set the size of the queue to be k. */
  public CircularQueue(int k) {
    capacity = k;
    queue = new int[capacity];
    front = 0;
    rear = -1;
    currSize =0;
  }

  /** Insert an element into the circular queue. Return true if the operation is successful. */
  public boolean enQueue(int value) {
    if(isFull()) {
      return false;
    }
    rear = (rear + 1) % capacity;
    queue[rear] = value;
    currSize++;
    return true;
  }

  /** Delete an element from the circular queue. Return true if the operation is successful. */
  public boolean deQueue() {
    if(isEmpty()){
      return false;
    }
    currSize--;
    front = (front +1) % capacity;
    return true;
  }

  /** Get the front item from the queue. */
  public int Front() {
    if(!isEmpty()){
      return queue[front];
    }
    return -1;
  }

  /** Get the last item from the queue. */
  public int Rear() {
    if(!isEmpty()){
      return queue[rear];
    }
    return -1;
  }

  /** Checks whether the circular queue is empty or not. */
  public boolean isEmpty() {
    return currSize==0;
  }

  /** Checks whether the circular queue is full or not. */
  public boolean isFull() {
    return capacity==currSize;
  }
}