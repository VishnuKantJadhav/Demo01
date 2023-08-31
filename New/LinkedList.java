package New;

public class LinkedList {


    class Node{
        constructor(data){
            this.value=data;
            this.next=null;
        }
        }
        class LinkedList{
            constructor(data){
                const newnode = new Node(data);
                this.head=newnode;
                this.tail=newnode;
                this.length=1;
            }
            push(value)
         {     
            const newNode=new Node(data);
            if(this.length==0){
                this.head=newNode;
                this.tail=this.head;
            }
            else{
                this.tail.next=newNode;
                this.tail=newNode;
            }
            this.length++;
            return this;
            }
    
            pop(){
                if(this.length==0)return undefined;
                if(this.length===1){
                    let temp=this.head;
                    this.head=null;
                    this.tail=null;
                    this.length--;
                    return temp;
                }
                else{
                    let temp=this.head;
                    let prev=this.head;
                    while(temp.next){
                        prev=temp;
                        temp=temp.next
                    }
                    this.tail=prev;
                    this.tail.next=null;
                    this.length--;
                    return temp;
                }
                }
                unshift(value){
                    const newNode=new Node(value);
                    if(this.length==0){
                        this.head=newNode;
                        this.tail=this.head;
                    }
                    else{
                        newNode.next=this.head;
                        this.head=newNode;
                    }
                    this.length++;
                    return this;
                }
    
                shift(){
                    if(this.length==0)return undefined;
                    let temp=this.head;
                    if(this.length===1){
                        this.head=null;
                        this.tail=null;
                    }
                    else{
                        this.head=this.head.next;
                        temp.next=null;
                    }
                    this.length--;
                    return temp;
                }
            }
            
            const obj=new LinkedList(2);
            console.log(obj);
            obj.push(3);
            obj.push(4);
            obj.push(5);
            obj.push(6);
            obj.push(7);
            obj.push(8);
            obj.unshift(10);
            console.log(JSON.stringify(obj));
            let p=obj.pop();
            let p1=obj.shift();
            console.log(JSON.stringify(obj));
            console.log(p);
            console.log(p1);
    
    
           
       
    
    
    
     
    }
