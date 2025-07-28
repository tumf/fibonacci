// Fibonacci sequence in JavaScript

function fibonacci(n) {
  if (n <= 0) return [];
  if (n === 1) return [0];
  const seq = [0, 1];
  for (let i = 2; i < n; i++) {
    seq.push(seq[i - 1] + seq[i - 2]);
  }
  return seq;
}

// Usage example: print first 10 Fibonacci numbers
if (require.main === module) {
  const n = process.argv[2] ? parseInt(process.argv[2], 10) : 10;
  console.log(`First ${n} Fibonacci numbers:`);
  console.log(fibonacci(n).join(", "));
}

module.exports = fibonacci;