if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode tmp,ans;
        if(l1.val <= l2.val){
            tmp = l1;
            l1 = l1.next;
        }else{
            tmp = l2;
            l2 = l2.next;
        }
        ans = tmp;

        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                tmp.next = l1;
                tmp = tmp.next;
                l1 = l1.next;
            }else{
                tmp.next = l2;
                tmp = tmp.next;
                l2 = l2.next;
            }
        }
        if(l2 == null) tmp.next = l1;
        else tmp.next = l2;
        return ans;