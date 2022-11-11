require "gtk3"

builder = Gtk::Builder.new
builder.add_from_file("CRUDViewPart.glade")
window = builder.get_object("CRUD")
window.show_all
Gtk.main
