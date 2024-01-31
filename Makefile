# Makefile

# Kullanılacak derleyici
JAVAC = javac

# Kaynak kodu bulunan klasör
J_DIR = javadir

# Derlenmiş .class dosyalarının çıkacağı klasör
C_DIR = classdir

# Çalıştırılacak uygulamanın adı
NAME = StockManagementGUI

# Kaynak dosyalar
SRC = $(J_DIR)/StockManagement.java \
	  $(J_DIR)/Products.java \
      $(J_DIR)/StockManagementGUI.java

# Hedef: Varsayılan olarak ilk kural çalıştırılır
all: $(NAME)

# .class dosyalarını oluştur ve uygulamayı çalıştır
$(NAME): $(SRC)
	@$(JAVAC) -d $(C_DIR) $^
	@echo "Running..."
	@java -cp $(C_DIR) $(NAME)

clean:
	@echo "Cleaning..."
	@rm -rf $(C_DIR)/*.class

.PHONY: all clean
