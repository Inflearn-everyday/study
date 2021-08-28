// ㅇㅅ 1

function solution(word) {
  const lists = { number: [], string: [] };

  // 숫자, 문자 분리해서 저장합니다.
  for (let i = 0; i < word.length; i++) {
    const char = word.charAt(i);
    if (Number.isNaN(parseInt(char, 10))) lists.string.push(char);
    else lists.number.push(char);
  }

  const numberStringLenDiff = lists.number.length - lists.string.length;
  if (Math.abs(numberStringLenDiff) > 1) return "";

  const longer = numberStringLenDiff >= 0 ? lists.number : lists.string;
  const shorter = longer === lists.number ? lists.string : lists.number;
  let res = "";
  for (let i = 0; i < shorter.length; i++) {
    res += longer[i] + shorter[i];
  }

  if (longer.length != shorter.length) res += longer[longer.length - 1];

  return res;
}
