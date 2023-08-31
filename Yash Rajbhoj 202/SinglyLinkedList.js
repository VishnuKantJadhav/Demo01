class Node
{
    constructor (data)
    {
        this.value = data;
        this.next = null;
    }
}
class Linklist
{
    constructor (data)
    {
        // create a Node
        const newnode = new Node (data);
        // initialize head and tail
        this.head = newnode;
        this.tail = newnode;
        // initialize length
        this.length = 1;
    }


push(value)
{
    const newNode = new Node(value);
    // adding a node to an empty linkedlist
    if(!this.length)
    {
        this.head = newNode;
        this.tail = this.head;
    }
    else
    {
        this.tail.next = newNode;
        this.tail = newNode;
    }
    this.length++;
    return this;
}
Pop()
{
    if(!this.length) return undefined;
    // one item in list
    if (this.length === 1)
    {
        let temp = this.head;
        this.head = null;
        this.tail = null;
        this.length --;
        return temp;
    }
    else
    {
        let temp = this.head;
        let prev = this.head;
        while (temp.next)
        {
            prev = temp;
            temp = temp.next;
        }
        this.tail = prev;
        this.tail.next = null;
        this.length --;
        return temp;
    }
}
unshift(value)
{
    const newNode = new Node(value);
    if(!this.length)
    {
        this.tail = newNode;
        this.head = this.tail;
    }
    else
    {
        newNode.next = this.tail;
        this.tail = newNode;
    }
    this.length ++;
    return this ;
}
shift()
{
    if(!this.length) return undefined;
    let temp = this.head;
    if(this.length === 1)
    {
        this.head = null; // this will be a pointer which head is pointing
        this.tail = nill;
    }
    else
    {
        this.head = this.head.next;
        temp.next = null;
    }
    this.length--;
    return temp;
}
}
const ll = new Linklist(3);
ll.push(6);
ll.push(9);
ll.push(12);
ll.push(15);
ll.unshift(18);
let p = ll.Pop();
let p1 = ll.shift();
console.log(JSON.stringify(ll));
console.log(ll);
console.log(p);
console.log(p1);

 