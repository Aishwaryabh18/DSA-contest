// Distance(head → cycle start) = Distance(meeting point → cycle start)
// 1 → 2 → 3 → 4 → 5    
//           ↑     ↓
//           ← ← ←

public static int detectCycle(Node head) {
    if(head== null || head.next == null){
        return -1;
    }
    Node s = head;
    Node f = head;
    int idx = 0;
    while(f!=null && f.next!=null){
        s=s.next;
        f=f.next.next;
        if(s==f){
            break;
        }
    }
    if(s!=f){ // exit, if no cycle
        return -1;
    }
    s=head;
    while(s!=f){
        s=s.next;
        f=f.next;
        idx++;
    }
   
    return idx;
}
