import { defineStore } from 'pinia'
import { getUserProfile, login } from '../api/auth'

interface UserProfile {
  id: number
  username: string
  nickname: string
}

export const useUserStore = defineStore('user', {
  state: () => ({
    token: localStorage.getItem('token') ?? '',
    profile: null as UserProfile | null
  }),
  actions: {
    async login(username: string, password: string) {
      const response = await login({ username, password })
      this.token = response.token
      localStorage.setItem('token', response.token)
    },
    async fetchProfile() {
      this.profile = await getUserProfile()
    },
    logout() {
      this.token = ''
      this.profile = null
      localStorage.removeItem('token')
    }
  }
})
