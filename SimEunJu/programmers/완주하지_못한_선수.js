function solution(participant, completion) {

    participant.sort();
    completion.sort();
    const res = [];
    let lastIdx = 0;
    
    for(let i = 0; i<participant.length; i++){
        const idx = completion.indexOf(participant[i], lastIdx);
        if(idx === -1) return participant[i];
        else{
            lastIdx = idx;
            completion[idx] = "";
        } 
    }
    
}
