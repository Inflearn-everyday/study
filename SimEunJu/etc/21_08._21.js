// ㅇㄷㅈ
function solution(passwords, s) {
    const inputs = s.split("#");
    const passwordPair = {};
    for(const [room, password] of passwords){
        passwordPair[room] = password;
    }
    
    let i = 0, res = 0;
    while(i < inputs.length - 1){
        const room = inputs[i];
        const len = room.length;
        const floor = parseInt(room.substring(0, len-1), 10);
        const nth = parseInt(room.substring(len-1, len), 10);
        const availFloor = floor >= 1 && floor <= 20;
        const availNth = nth === 1 || nth === 2;
        const availRoom = availFloor && availNth;
        i += 1;
        if(!availRoom) continue;
        if(i === inputs.length - 1) break;
        const password = parseInt(inputs[i], 10);
        const availPassword = password >= 1 && password <= 999999;
        i += 1;
        if(!availPassword) continue;
        if(passwordPair[room] === password) res += 1;
        
    }
    
    return res;
}
