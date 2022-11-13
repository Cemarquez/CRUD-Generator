require "gtk3"

builder = Gtk::Builder.new
builder.add_from_file("VentanaColegioViewPart.glade")
window = builder.get_object("VentanaColegio")
