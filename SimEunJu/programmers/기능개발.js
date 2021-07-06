function solution(progresses, speeds) {
    let start = 0, end = 0;
    let remain = Math.ceil((100 - progresses[0]) / speeds[0]);
    
    const result = [];
    while(end < progresses.length){
        
        const remainNext = Math.ceil((100 - progresses[end]) / speeds[end]);
 
        if(remainNext <= remain){
            end++;
            if(end === progresses.length) result.push(end - start);
            continue;
        }
       
        result.push(end - start);
        remain = remainNext;
        start = end;
    
    }
    return result;
}
