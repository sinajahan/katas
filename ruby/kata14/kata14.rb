# encoding: utf-8

require 'ap'

#file = 'small.txt'
file = 'star_trek.txt'
raise "ERROR: file not found: #{file}" unless File.exists? file

dictionary  = {}
text        = File.read file
story       = ''

# Replace all characters except letters, dots, and single-quotes with a space.
text.gsub!(/’/, "'")
text.gsub!(/[^a-z .']/i, ' ')
text.gsub!(/  +/, ' ')

# Lowercase the first letter of every sentence.
text.gsub!(/\. ([A-Z][^A-Z]+ )/) do |match|
  match[-1] = match[-1].downcase
  match
end

words = text.split ' '
words.each_with_index do |word, i|
  break if i == words.length - 3

  word_pair = [ word, words[i + 1] ]

  dictionary[word_pair] ||= []
  dictionary[word_pair].push words[i + 2]
end

starting_index  = Random.rand dictionary.count
index           = dictionary.keys[starting_index]
third_word      = dictionary[index].sample
new_words       = index.join ' '
story           += new_words

while true do
  break unless dictionary[index]

  third_word  = dictionary[index].sample
  story       += ' ' + third_word
  index       = [ index.last, third_word ]

  # Insert random paragraphs.
  story += "\n\n" if third_word[-1] == '.' and Random.rand(10) == 1
end

# Capitalize the first letter of the story.
story[0] = story[0].upcase

# Capitalize the first letter of every sentence.
story.gsub!(/\. ([a-z])/) do |match|
  match[-1] = match[-1].upcase
  match
end

index_of_first_dot = story.index '. '
title = story[0..index_of_first_dot]

story.sub!(title, '').strip!
story += '.'
title = title[0..-2]

puts '== ' + title + ' =='
puts 
puts story

