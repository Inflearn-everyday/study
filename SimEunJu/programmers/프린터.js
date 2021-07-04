function solution(priorities, location) {
    let i = 0;
    let cnt = 0;
    while(true){
        const p = priorities.shift();
        const len = priorities.length;
        let isPrinted = true;
        
        for(let j=0; j<len; j++){
            if(p < priorities[j]){
                isPrinted = false;
                priorities.push(p);
                break;
            }
        }
        
        if(isPrinted){
            cnt++;
            if(location === 0) return cnt;
        }
        else if(location === 0) location = priorities.length;
        location--;
    }
}
