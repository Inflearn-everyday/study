// ㅇㅅ 2

function solution(target, words) {
  const ALPHABET_LEN = 26;
  const alphabet = new Array(ALPHABET_LEN).fill(false);
  const aCodePoint = "a".charCodeAt(0);

  // target에서 사용된 알파벳에 해당하는 값만 true로 설정합니다.
  for (let i = 0; i < target.length; i++) {
    const idx = target.charCodeAt(i) - aCodePoint;
    alphabet[idx] = true;
  }

  let res = 0;
  for (let i = 0; i < words.length; i++) {
    const word = words[i];
    let isAllpass = true;

    // target에서 주어진 알파벳만 사용하는지 확인합니다.
    for (let j = 0; j < word.length; j++) {
      const idx = word.charCodeAt(j) - aCodePoint;

      if (!alphabet[idx]) {
        isAllpass = false;
        break;
      }
    }

    if (isAllpass) res += 1;
  }
  return res;
}
