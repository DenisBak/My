counter[0]

    def die(self, type):
        global inGame
        global counter
        global mario
        global flags
        pygame.mixer.music.stop()
        if type == 1:
            pygame.mixer.quit()
            pygame.quit()
            sys.exit()
        elif counter[0] == 0 and len(counter) != 3:
            counter.append(0)
            self.sound_die.play()
            pygame.time.wait(2500)
            mario = Mario(190, 400)
            pygame.mixer.music.stop()
            pygame.mixer.music.play(loops=-1)
        elif counter[2] == 0:
            inGame = False
            self.sound_die.play()
            pygame.time.wait(2500)
            screen.blit(game_over, (0, 0))
            window.blit(screen, (0, 0))
            pygame.display.flip()
            self.sound_game_over.play()
            pygame.time.wait(4000)
            pygame.mixer.quit()
            pygame.quit()
            sys.exit()
