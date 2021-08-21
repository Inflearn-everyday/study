// ㅇㄷㅈ 3
function solution(arr) {
    const splitArr = (arr, sub) => {
        const subArrs = [];
        let prevIdx = 0;
        for(let i=0; i<arr.length; i++){
            if(arr[i] - sub === 0){
                const subArr = arr.slice(prevIdx, i);
                if(subArr.length !== 0) subArrs.push(subArr);
                prevIdx = i + 1;
            }
        }
        if(prevIdx === 0) return [ arr ];
        if(prevIdx !== arr.length) subArrs.push(arr.slice(prevIdx, arr.length));
        
        return subArrs;
    }
    
    let subArrs = splitArr(arr, 0);
    
    let res = 0;
    while(subArrs.length > 0){
        const subArr = subArrs.pop();
        const minVal = Math.min(...subArr);
        res += 1;
        if(subArr.length === 1) continue;
        
        subArrs = [...subArrs, ...splitArr(subArr, minVal)];
    }
    
    
    return res;

}
