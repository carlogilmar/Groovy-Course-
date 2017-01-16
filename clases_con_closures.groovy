class Player {

	def play

	def execute(game){
		play(game)
	}
}

def p = new Player()
p.setPlay { game ->
	println "Playing $game"
}
p.execute("FIFA")
p.execute("Halo")

p.play("Zelda")