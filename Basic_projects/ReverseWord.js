let sentence="Reverse of each word in a sentence";
function reverseWords(str) {
    let reverse = str.split(" ").map(word => word.split("").reverse().join(""));
    return reverse.join(" ");
  }
  console.log(reverseWords(sentence));
