file = 'input.txt'
raise "Error: file not found: #{file}" unless File.exists? file

map = Hash.new

contents = File.read file
clipings = contents.split('==========')
clipings.each do |cliping|
  cliping_items = cliping.split('(sinajahangir@gmail.com)')
  if cliping_items.size > 1
    title = cliping_items[0]
    map[title] ||= []
    cliping_items = cliping_items[1, cliping_items.length]
    map[title].push cliping_items
  end
end

map.each { |key, value|
  out = value.join
  out = out.gsub(/- Your Highlight Location .*$/, "")
  output = File.open("out/#{key}.txt", 'w')
  output << out 
  output.close
}
