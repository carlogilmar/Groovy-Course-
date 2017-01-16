import groovy.swing.*

variable = 0

def frame = new SwingBuilder().frame(size:[300,300], title:"Shuper App") {
  flowLayout()
  label(text: "Label")
  text = textField(columns:30)
  button(text: "Pushme!!!!", actionPerformed : {
    variable++
    text.text = variable
  })
  menuBar {
    menu("Archivo"){
      menuItem("Abrir..")
      menuItem("Guardar..")
    }
  }
}

frame.show()
