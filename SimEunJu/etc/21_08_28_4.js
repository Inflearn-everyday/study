// ㅇㅅ 4

function solution(matrix) {
  let res = 0;
  for (let i = 0; i < matrix.length; i++) {
    const row = matrix[i];
    res += row[i] + row[matrix.length - 1 - i];
  }

  // 행렬의 행 갯수가 홀수일 경우 정중앙 값이 2번 더해지기 때문에 빼줍니다.
  if (matrix.length % 2 === 1) {
    const mid = Math.floor(matrix.length / 2);
    res -= matrix[mid][mid];
  }
  return res;
}
