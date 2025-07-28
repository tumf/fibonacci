#!/usr/bin/env node

function fibonacci(n) {
  if (n === 0) return 0;
  if (n === 1) return 1;
  let a = 0, b = 1;
  for (let i = 2; i <= n; i++) {
    [a, b] = [b, a + b];
  }
  return b;
}

function printUsageAndExit() {
  console.error('Usage: node fibonacci.js <n>');
  process.exit(1);
}

if (require.main === module) {
  const args = process.argv.slice(2);
  if (args.length !== 1) {
    printUsageAndExit();
  }
  const n = Number(args[0]);
  if (!Number.isInteger(n) || n < 0) {
    console.error('Error: n must be a non-negative integer.');
    process.exit(1);
  }
  console.log(fibonacci(n));
}

